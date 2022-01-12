@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    switch (intent.getAction()) {
        case net.nitroshare.android.transfer.TransferService.ACTION_START_LISTENING :
            startListening();
            break;
        case net.nitroshare.android.transfer.TransferService.ACTION_STOP_LISTENING :
            stopListening();
            break;
        case net.nitroshare.android.transfer.TransferService.ACTION_START_TRANSFER :
            startTransfer(intent);
            break;
        case net.nitroshare.android.transfer.TransferService.ACTION_STOP_TRANSFER :
            stopTransfer(intent);
    }
    return START_STICKY;
}