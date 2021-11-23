@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    java.lang.System.out.println("List of bots:");
    while (conversation.listBots().iterator().hasNext()) {
        java.lang.System.out.format("   %s\n", conversation.listBots().iterator().next());
    } 
}