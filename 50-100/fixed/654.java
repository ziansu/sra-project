@java.lang.Override
public void done(java.util.List<com.avos.avoscloud.AVObject> list, com.avos.avoscloud.AVException e) {
    if ((list.size()) > 0) {
        int[] allRateScores = new int[list.size()];
        int i = 0;
        for (com.avos.avoscloud.AVObject object : list) {
            allRateScores[i] = object.getInt("subQues");
            i++;
        }
        plotBarChart(allRateScores);
    }
}