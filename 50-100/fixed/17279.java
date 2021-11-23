public static java.util.ArrayList<com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel> hoofdfase1(android.content.Context context, com.hsl.imtpmd.imtpmd.model.UserModel user) {
    java.util.ArrayList<com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel> verplichtvakModels = com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel.all(context, user);
    java.util.ArrayList<com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel> hoofdfase1vakken = new java.util.ArrayList<com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel>();
    for (com.hsl.imtpmd.imtpmd.model.UserVerplichtvakModel vak : verplichtvakModels) {
        if (vak.getVerplichtvak().getJaar_id().equals("2")) {
            hoofdfase1vakken.add(vak);
        }
    }
    return hoofdfase1vakken;
}