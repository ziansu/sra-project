@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String searchString = profileName.getText().toString().toLowerCase();
    new it15ns.friendscom.grpc.GrpcTask(it15ns.friendscom.grpc.GrpcRunnableFactory.getSearchProfileRunnable(searchString, this), getApplicationContext()).execute();
}