public static void initialize(java.awt.TrayIcon trayIcon) {
    switch (net.Utils.getOS()) {
        case WINDOWS :
            net.NotificationConnector.notifer = new net.Notifer.Notifer.Notifers.Snarl();
            if (net.NotificationConnector.notifer.laod())
                return ;
            
            net.NotificationConnector.notifer = new net.Notifer.Notifer.Notifers.NetSnarl();
            if (net.NotificationConnector.notifer.laod())
                return ;
            
            break;
        case MAC :
            net.NotificationConnector.notifer = new net.Notifer.Notifer.Notifers.Growl();
            if (net.NotificationConnector.notifer.laod())
                return ;
            
            break;
    }
    net.NotificationConnector.notifer = new net.Notifer.Notifer.Notifers.TrayNotification(trayIcon);
}