private de.panzercraft.objects.Message rollOut() {
    de.panzercraft.objects.Message message = new de.panzercraft.objects.Message();
    boolean isHostX = (java.lang.Math.random()) >= 0.5;
    if (isHostX) {
        message.host = de.panzercraft.objects.Field.X;
        message.slave = de.panzercraft.objects.Field.O;
    }else {
        message.host = de.panzercraft.objects.Field.O;
        message.slave = de.panzercraft.objects.Field.X;
    }
    return message;
}