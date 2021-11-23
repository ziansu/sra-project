private int findCurrentlySelected(int x, int y) {
    int total = 0;
    for (int i = 0; i < (testData.size()); i++) {
        total += ((testData.get(i).getTime()) * (thesis.views.Timeline.getUnselectedWidth())) / (thesis.Activator.TimeGoal);
        if (total > x)
            return i;
        
    }
    return Timeline.testSuite.size();
}