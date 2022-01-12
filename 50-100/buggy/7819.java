public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        mAPI.revokeContactFromChain(mAPI.getBlocks(owner).get(position).getBlockOwner());
    } catch (nl.tudelft.b_b_w.model.HashException e) {
        android.widget.Toast.makeText(context, retrievingHashError, Toast.LENGTH_LONG).show();
    } catch (nl.tudelft.b_b_w.model.BlockAlreadyExistsException e) {
        e.printStackTrace();
    }
    notifyDataSetChanged();
    dialog.dismiss();
}