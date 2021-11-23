@java.lang.Override
public void onDelete() {
    if (com.google.gwt.user.client.Window.confirm((("Are you sure you want to delete " + (candidate.getName())) + " ?"))) {
        dispatch.execute(adminService.removeCandidate(candidate.getId()), new com.arcbees.bourseje.client.AdminRestCallback<java.lang.Void>() {
            @java.lang.Override
            public void onSuccess(java.lang.Void result) {
                removeFromParentSlot();
            }
        });
    }
}