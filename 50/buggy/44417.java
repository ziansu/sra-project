@java.lang.Override
public void checkTransferButton(com.esbjon.UI.UISlotItem item, com.esbjon.UI.BarSlot fromSlot) {
    if (((com.esbjon.entities.Shuttle) (holder)).isGrounded()) {
        if (item instanceof com.esbjon.UI.UIDragItemTeammate) {
            fromSlot.addTransferButton(false);
        }
    }
}