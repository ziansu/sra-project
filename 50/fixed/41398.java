void update(@android.support.annotation.NonNull
com.abnormallydriven.architecturecomponentspost.common.data.entities.User[] updatedUsers) {
    users = updatedUsers;
    notifyDataSetChanged();
}