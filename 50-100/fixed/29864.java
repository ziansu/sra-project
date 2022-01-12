@org.junit.Test
public void constructWithNotificationRequest_propertiesSetCorrectly() {
    com.cyanelix.railwatch.firebase.client.entity.NotificationRequest notificationRequest = new com.cyanelix.railwatch.firebase.client.entity.NotificationRequest(com.cyanelix.railwatch.domain.NotificationTarget.of("FOO"), "Title", "Body");
    com.cyanelix.railwatch.entity.SentNotificationEntity entity = com.cyanelix.railwatch.entity.SentNotificationEntity.of(notificationRequest, java.time.LocalDateTime.of(2017, 1, 1, 10, 0));
    assertThat(entity.getTo(), org.hamcrest.CoreMatchers.is("FOO"));
    assertThat(entity.getTitle(), org.hamcrest.CoreMatchers.is("Title"));
    assertThat(entity.getBody(), org.hamcrest.CoreMatchers.is("Body"));
}