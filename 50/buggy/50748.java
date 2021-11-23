public static void setAggScores(int[] aggScores) {
    com.usp.kiss.client.AppUtils.aggScores = aggScores;
    com.usp.kiss.client.AppUtils.EVENT_BUS.fireEvent(new com.usp.kiss.client.event.AggScoreChangedEvent());
}