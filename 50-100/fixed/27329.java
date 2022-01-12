@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    switch (intent.getAction()) {
        case net.nitroshare.android.transfer.TransferService.ACTION_START_LISTENING :
            return startListening();
        case net.nitroshare.android.transfer.TransferService.ACTION_STOP_LISTENING :
            return stopListening();
        case net.nitroshare.android.transfer.TransferService.ACTION_START_TRANSFER :
            return startTransfer(intent);
        case net.nitroshare.android.transfer.TransferService.ACTION_STOP_TRANSFER :
            return stopTransfer(intent);
    }
    return 0;
}