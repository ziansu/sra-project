@java.lang.Override
public void run() {
    if (((lineList) != null) && ((lineList.size()) > 0)) {
        com.yhtye.gongjiao.entity.LineInfo lineInfo = getNowLineInfo();
        lineInfo = lineService.getLineStation(lineInfo, 1, true);
        if ((lineInfo.getStations()) != null) {
            android.os.Message msg2 = new android.os.Message();
            msg2.what = com.yhtye.gongjiaochaxun.ResultActivity.OtherStationsMessage;
            handler.sendMessage(msg2);
        }
    }
}