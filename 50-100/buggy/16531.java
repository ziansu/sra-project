@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    displayChange.setDisplay(intent.getStringExtra("ACC"), intent.getStringExtra("GYR"), intent.getStringExtra("GRA"));
    move = new com.unist.netlab.fakturk.more.Move(intent.getFloatArrayExtra("ACC_DATA"), intent.getFloatArrayExtra("GYR_DATA"), intent.getFloatArrayExtra("GRA_DATA"), intent.getFloatExtra("TIME", 0), tv, tvMain, tvAngle, root);
    alpha = move.rotateText(mdisp, alpha);
}