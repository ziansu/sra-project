@java.lang.Override
public boolean onCreateOptionsMenu(com.goldmanalpha.dailydo.Menu menu) {
    menu.add(0, com.goldmanalpha.dailydo.MainActivity.MenuItems.AddItem, 0, "Add Item");
    PublicPrivateMenuItem = menu.add(0, com.goldmanalpha.dailydo.MainActivity.MenuItems.PublicPrivateSwitch, 0, "Pub Only");
    menu.add(0, com.goldmanalpha.dailydo.MainActivity.MenuItems.Quit, 0, "Quit");
    menu.add(1, com.goldmanalpha.dailydo.MainActivity.MenuItems.BackupFolder, 0, "Backup Folder");
    menu.add(1, com.goldmanalpha.dailydo.MainActivity.MenuItems.Backup, 0, "Backup");
    menu.add(1, com.goldmanalpha.dailydo.MainActivity.MenuItems.DeleteDb, 0, "DELETE DB");
    return true;
}