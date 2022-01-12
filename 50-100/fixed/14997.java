@java.lang.Override
public void checkTransferButtons() {
    if (this.isGrounded()) {
        for (int i = 0; i < (teammates.size); i++) {
            com.esbjon.UI.BarSlot slot = level.findTeammateSlot(teammates.get(i));
            if (slot != null) {
                slot.addTransferButton(false);
            }
        }
    }
}