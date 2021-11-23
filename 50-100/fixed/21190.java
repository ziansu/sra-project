public void hovered() {
    if (world.mouse.shift_down) {
        world.mouse.shift_down = false;
        slot.hovered();
        world.mouse.shift_down = true;
    }else {
        if (((world.mouse.lb_pressed) && ((world.mouse.slot.item) == null)) && (slot.consume(world.player)))
            return ;
        
        slot.hovered();
        world.descBox.text = "";
    }
}