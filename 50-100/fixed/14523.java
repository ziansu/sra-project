@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    for (com.firebase.client.DataSnapshot child : dataSnapshot.getChildren()) {
        study.shpe.com.shpestudy.DerpEvent event = child.getValue(study.shpe.com.shpestudy.DerpEvent.class);
        study.shpe.com.shpestudy.model.ListItem item = new study.shpe.com.shpestudy.model.ListItem();
        item.setTitle(event.nameText);
        item.setSubTitle(event.placeText);
        java.lang.System.out.println(((event.nameText) + (event.placeText)));
        data.add(item);
    }
}