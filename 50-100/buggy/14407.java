@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.accept_request :
            java.lang.System.out.println("executed accept");
            loadingOverlay.setVisibility(View.VISIBLE);
            android.content.Intent intent = new android.content.Intent(this, edu.jhu.tutorsanonymous.ChatActivity.class);
            startActivity(intent);
            break;
        case R.id.decline_request :
            loadingOverlay.setVisibility(View.VISIBLE);
            new edu.jhu.tutorsanonymous.tasks.UpdateRequestTask(this, this, 1, requestId).execute();
            break;
    }
}