public static void addSystemSlice(SystemSlice slice) {
    VisualGUI.overallSeries1.add(((slice.getTime()) - (VisualGUI.programStartTime)), slice.getCpu());
}