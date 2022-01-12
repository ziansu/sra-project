@java.lang.Override
public void updateFromObject() {
    updateEditableState();
    if (!(isValidObject()))
        return ;
    
    ignoreEditorActions = true;
    org.miradi.objects.BaseObject baseObject = org.miradi.objects.BaseObject.find(getProject(), getORef());
    org.miradi.objecthelpers.ORefList planningObjectRefs = baseObject.getTimeframeRefs();
    timeframeEditor.setPlanningObjectRefs(planningObjectRefs);
    ignoreEditorActions = false;
}