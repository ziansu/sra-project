public static void exception(java.lang.Exception e) {
    org.ts_labs.example.ConsolePrinter.sb.delete(0, org.ts_labs.example.ConsolePrinter.sb.length());
    org.ts_labs.example.ConsolePrinter.sb.append(org.ts_labs.example.ConsolePrinter.ERROR_TEXT_FORMAT_START).append(e.getMessage());
    org.ts_labs.example.ConsolePrinter.printHelp(org.ts_labs.example.ConsolePrinter.sb);
    org.ts_labs.example.ConsolePrinter.log.info(org.ts_labs.example.ConsolePrinter.sb.append(org.ts_labs.example.ConsolePrinter.ERROR_TEXT_FORMAT_STOP));
    org.ts_labs.example.ConsolePrinter.logError.error("", e);
}