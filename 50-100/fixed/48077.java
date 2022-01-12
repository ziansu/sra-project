private static net.videgro.ships.fragments.internal.OpenDeviceResult parseOpenCloseDeviceActivityResult(final android.content.Intent data) {
    net.videgro.ships.fragments.internal.OpenDeviceResult result = null;
    if (data != null) {
        result = new net.videgro.ships.fragments.internal.OpenDeviceResult(data.getStringExtra(OpenDeviceActivity.EXTRA_RESULT_MESSAGE), data.getStringExtra(OpenDeviceActivity.EXTRA_RESULT_DEVICE_DESCRIPTION), data.getIntExtra(OpenDeviceActivity.EXTRA_RESULT_ERROR_REASON, (-1)));
    }
    return result;
}