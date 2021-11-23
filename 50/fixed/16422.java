@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.apple.newsingit_project.CreateFolderActivity.class);
    startActivityForResult(intent, com.example.apple.newsingit_project.SelectNewsDetailActivity.RC_CREATEFOLDER);
    scrap_folder_recyclerview.addHeaderView(headerview);
}