@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent service = new android.content.Intent(context, homework.softuni.bg.homework4_2batteryservice.service.BatteryService.class);
    if (intent.hasExtra(MainActivity.BATTERY_LEVEL)) {
        service.putExtra(MainActivity.BATTERY_LEVEL, intent.getIntExtra(MainActivity.BATTERY_LEVEL, 1));
    }
    context.startService(service);
}