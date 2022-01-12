private static int getServerPort(java.lang.String[] args) {
    if ((args.length) > 0) {
        try {
            return java.lang.Integer.valueOf(args[0]);
        } catch (java.lang.NumberFormatException e) {
            cn.momia.admin.web.MomiaAdminWeb.LOGGER.error("invalid server port argument: {}", args[0]);
        }
    }
    return cn.momia.admin.web.MomiaAdminWeb.DEFAULT_SERVER_PORT;
}