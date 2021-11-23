public void run() {
    ctx.getServerHandler().player.openContainer.onContainerClosed(ctx.getServerHandler().player);
    ctx.getServerHandler().player.openGui(Baubles.instance, Baubles.GUI, ctx.getServerHandler().player.world, message.mouseX, message.mouseY, 0);
}