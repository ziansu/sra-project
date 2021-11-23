private static void getFourMainLists() {
    userinterface.Controller._powerList = logic.DisplayCategory.getCommandArrListForGUI();
    userinterface.Controller.todayList = logic.DisplayCategory.getTodayArrListForGUI();
    userinterface.Controller._tomorrowList = logic.DisplayCategory.geTmrArrListForGUI();
    userinterface.Controller._upcomingList = logic.DisplayCategory.getUpcommingArrListForGUI();
    userinterface.Controller._somedayList = logic.DisplayCategory.getSomedaysArrListForGUI();
}