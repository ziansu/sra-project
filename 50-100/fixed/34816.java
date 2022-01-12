@org.junit.Test
public void testTarget() throws org.activityinfo.legacy.shared.exception.CommandException {
    org.activityinfo.legacy.shared.model.TargetDTO target = createTarget();
    org.activityinfo.legacy.shared.command.result.CreateResult cresult = execute(new org.activityinfo.server.command.AddTarget(org.activityinfo.server.command.TargetTest.db.getId(), target));
    int newId = cresult.getNewId();
    java.util.List<org.activityinfo.legacy.shared.model.TargetDTO> targets = execute(new org.activityinfo.server.command.GetTargets(org.activityinfo.server.command.TargetTest.db.getId())).getData();
    org.activityinfo.legacy.shared.model.TargetDTO dto = getTargetById(targets, newId);
    assertNotNull(dto);
    assertEquals("name", "Target0071", dto.getName());
}