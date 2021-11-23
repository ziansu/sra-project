private void readMail() {
    java.util.ArrayList<forhonour.Mail> mail = new java.util.ArrayList<forhonour.Mail>();
    mail = forhonour.ForHonour.usr.fetchMail();
    for (forhonour.Mail m : mail) {
        forhonour.ForHonour.door.writeln(("`6Message from " + (m.from)));
        forhonour.ForHonour.door.writeln("`6---------------------------------------------------`h");
        forhonour.ForHonour.door.writeln(m.message);
        forhonour.ForHonour.door.write("`6Press a key to continue...`h");
        forhonour.ForHonour.door.readch();
        forhonour.ForHonour.door.writeln("");
    }
}