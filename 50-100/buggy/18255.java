public void execute(ru.job4j.start.Input input, ru.job4j.start.Tracker tracker) {
    java.lang.String name = input.ask("Please enter name of item: ");
    ru.job4j.models.Item[] items = tracker.findByName(name);
    if ((items.length) != 0) {
        for (ru.job4j.models.Item item : items) {
            this.showItem(item);
        }
    }else {
        java.lang.System.out.println("Not found");
    }
    java.lang.System.out.println("Done.");
}