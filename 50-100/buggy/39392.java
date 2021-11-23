private java.lang.String getProgressText() {
    java.lang.String text = "";
    if (!(isFinish)) {
        if (!(isStop)) {
            text = ("数据采集中" + (progress)) + "%";
        }else {
            text = "继续";
        }
    }else {
        text = "数据采集完成";
    }
    return text;
}