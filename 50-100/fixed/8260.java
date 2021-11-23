public static java.lang.String getFeedbackGuideInfo() {
    ui.list.swing.DisplayFormat.clearData();
    ui.list.swing.DisplayFormat.data.append(ui.list.swing.DisplayFormat.HTML_OPEN);
    ui.list.swing.DisplayFormat.data.append(java.lang.String.format(ui.list.swing.DisplayFormat.HTML_FONT_FEEDBACK_GUIDE_INFO, UserInterface.BTM.getLastFeedBack()));
    ui.list.swing.DisplayFormat.data.append(ui.list.swing.DisplayFormat.HTML_CLOSE);
    return ui.list.swing.DisplayFormat.data.toString();
}