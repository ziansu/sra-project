@java.lang.Override
public void onClick(android.view.View v) {
    realm.beginTransaction();
    behdad222.realmrelationtest.Model.UserModel user = new behdad222.realmrelationtest.Model.UserModel();
    user.setServerID(id.getText().toString());
    user.setName(name.getText().toString());
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(user);
    realm.commitTransaction();
}