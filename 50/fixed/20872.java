private void join(wad.domain.Person person, wad.domain.Activity activity) {
    org.mockito.Mockito.when(personServiceMock.getAuthenticatedPerson()).thenReturn(person);
    java.lang.String activityID = activity.getId();
    activityController.joinActivity(activityID);
}