public static void main(java.lang.String[] args) throws clients.NoAvailableSpaceException, clients.NotADirectoryException, clients.NotInTreeException, clients.ParentException, clients.VirtualDiskDoesntExistException {
    clients.CLUI.crvfs("vfs1", 1000L);
    clients.CLUI.impvfs("eval/Host/level 1", "vfs1", "Home");
    java.lang.System.out.println("What would you like to do ? Type help to see the commands");
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    while (true) {
        java.lang.String str = scan.nextLine();
        clients.CLUI.understand(str);
    } 
}