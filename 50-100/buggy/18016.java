@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        start = new com.dimelo.sampleapp.chats.TabStart();
        return start;
    }else
        if (position == 1) {
            bank = new com.dimelo.sampleapp.chats.TabBank();
            return bank;
        }else
            if (position == 2) {
                telecom = new com.dimelo.sampleapp.chats.TabTelecom();
                return telecom;
            }else
                if (position == 3) {
                    support = new com.dimelo.sampleapp.chats.TabSupport();
                    return support;
                }else {
                    return new com.dimelo.sampleapp.chats.TabStart();
                }
            
        
    
}