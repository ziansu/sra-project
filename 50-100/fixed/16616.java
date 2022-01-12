private static void setDisplay() {
    main.display.Display.displayModule(main.Main.reader.getClass(), false);
    main.display.Display.displayModule(main.Main.localiser.getClass(), true);
    main.display.Display.displayModule(main.Main.normaliser.getClass(), false);
    main.display.Display.displayModule(main.Main.encoder.getClass(), false);
    main.display.Display.displayModule(main.Main.comparator.getClass(), false);
    main.display.Display.displayModule(main.Main.writer.getClass(), false);
}