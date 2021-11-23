private static int getServerPort(java.lang.String[] args) {
    if ((args.length) > 1) {
        try {
            return java.lang.Integer.valueOf(args[1]);
        } catch (java.lang.NumberFormatException e) {
            cn.momia.admin.web.MomiaAdminWeb.LOGGER.error("invalid server port argument: {}", args[1]);
        }
    }
    return cn.momia.admin.web.MomiaAdminWeb.DEFAULT_SERVER_PORT;
}