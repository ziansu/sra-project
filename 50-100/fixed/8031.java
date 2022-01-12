@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    com.firebase.client.GenericTypeIndicator<java.util.HashMap<java.lang.String, com.firebase.androidchat.bean.Channel>> t = new com.firebase.client.GenericTypeIndicator<java.util.HashMap<java.lang.String, com.firebase.androidchat.bean.Channel>>() {    };
    java.util.HashMap<java.lang.String, com.firebase.androidchat.bean.Channel> map = snapshot.getValue(t);
    if (map == null)
        return ;
    
    for (com.firebase.androidchat.bean.Channel c : map.values()) {
        channelList.add(c.getName());
    }
}