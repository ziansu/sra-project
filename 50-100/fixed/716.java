private void switchToRoomConfig(java.lang.String type, java.lang.String id) {
    android.content.Intent intent = null;
    if (type.equals("Lamp"))
        intent = new android.content.Intent(this, group7.at.ac.univie.cosycon.RoomConfig_lamp.class);
    else
        if (type.equals("TV"))
            intent = new android.content.Intent(this, group7.at.ac.univie.cosycon.Roomconfig_TV.class);
        else
            if (type.equals("Music"))
                intent = new android.content.Intent(this, group7.at.ac.univie.cosycon.RoomConfig_Music.class);
            
        
    
    intent.putExtra("GID", id);
    startActivity(intent);
}