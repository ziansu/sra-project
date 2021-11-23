private void treatGroupId(java.lang.String groupId, forms.Test test) {
    forms.Group group = new forms.Group();
    try {
        validateGroupId(groupId);
        group.setId(java.lang.Long.parseLong(groupId));
    } catch (java.lang.Exception e) {
        setError(forms.TestForm.GROUP_FIELD, e.getMessage());
    }
    test.setGroup(group);
}