@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, com.venkibellu.myapplication.FilterResults filterResults) {
    userList.clear();
    java.util.ArrayList<com.venkibellu.myapplication.ViewUsers.User> results = ((java.util.ArrayList<com.venkibellu.myapplication.ViewUsers.User>) (filterResults.values));
    if ((filterResults.count) > 0) {
        for (com.venkibellu.myapplication.ViewUsers.User user : results) {
            userList.add(user);
        }
        notifyDataSetChanged();
    }else {
        notifyDataSetChanged();
    }
}