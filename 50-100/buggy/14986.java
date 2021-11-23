@org.junit.Test
public void acceptShiftChangeEmployee() {
    java.sql.Timestamp date = java.sql.Timestamp.valueOf("1995-01-01 00:00:00");
    no.ntnu.stud.minvakt.data.NewsFeedItem notification = new no.ntnu.stud.minvakt.data.NewsFeedItem((-1), date, "Test", 1, 1, 4, NewsFeedItem.NewsFeedCategory.SHIFT_CHANGE_EMPLOYEE);
    int feedId = no.ntnu.stud.minvakt.util.ShiftChangeUtilTest.newsFeedDB.createNotification(notification);
    org.junit.Assert.assertTrue(no.ntnu.stud.minvakt.util.ShiftChangeUtil.updateNotification(feedId, true));
    org.junit.Assert.assertTrue(no.ntnu.stud.minvakt.util.ShiftChangeUtil.updateNotification(feedId, false));
    no.ntnu.stud.minvakt.util.ShiftChangeUtilTest.newsFeedDB.deleteNotification(feedId);
}