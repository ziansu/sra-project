public void use() {
    if ((items[selected]) != null)
        items[selected].item.use(this, level);
    else
        java.lang.System.out.println("Didn't your mother teach you not to use nothing!?");
    
}