private static org.worldcooking.web.worldcooking.history.model.WorldcookingHistory getHistory(javax.servlet.http.HttpSession session) {
    org.worldcooking.web.worldcooking.history.model.WorldcookingHistory historyModel = ((org.worldcooking.web.worldcooking.history.model.WorldcookingHistory) (session.getAttribute("history")));
    if (historyModel == null) {
        historyModel = new org.worldcooking.web.worldcooking.history.model.WorldcookingHistory();
        session.setAttribute("history", historyModel);
    }
    return historyModel;
}