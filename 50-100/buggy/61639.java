@java.lang.Override
public void run() {
    com.yhtye.gongjiao.entity.LineInfo lineInfo = getNowLineInfo();
    if ((lineInfo.getStations()) == null) {
        lineInfo = lineService.getLineStation(lineInfo, ((position) + 1), true);
    }else {
        lineInfo = lineService.getLineStation(lineInfo, ((position) + 1), false);
    }
    android.os.Message msg = new android.os.Message();
    msg.what = com.yhtye.gongjiaochaxun.ResultActivity.CarsMessage;
    handler.sendMessage(msg);
}