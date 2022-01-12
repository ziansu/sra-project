@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        bank = new com.dimelo.sampleapp.chats.TabBank();
        return bank;
    }else
        if (position == 1) {
            telecom = new com.dimelo.sampleapp.chats.TabTelecom();
            return telecom;
        }else
            if (position == 2) {
                support = new com.dimelo.sampleapp.chats.TabSupport();
                return support;
            }else
                if (position == 3) {
                    start = new com.dimelo.sampleapp.chats.TabStart();
                    return start;
                }else {
                    return new com.dimelo.sampleapp.chats.TabBank();
                }
            
        
    
}