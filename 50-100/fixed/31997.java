public static void no_notify_delete(long uuid) {
    if (!(calico.controllers.CStrokeController.strokeExists(uuid)))
        return ;
    
    calico.controllers.CStrokeController.strokes.get(uuid).delete();
    calico.controllers.CStrokeController.strokes.remove(uuid);
    CGroupController.originalStroke = 0L;
    CGroupController.restoreOriginalStroke = false;
    calico.controllers.CStrokeController.dq_add(uuid);
}