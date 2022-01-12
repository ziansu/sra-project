public static void restartMainProcess(android.content.Context context) {
    context.startService(new android.content.Intent(context, me.ele.amigo.AmigoService.class).setAction(me.ele.amigo.AmigoService.ACTION_RESTART_MANI_PROCESS));
    java.lang.Process.killProcess(java.lang.Process.myPid());
}