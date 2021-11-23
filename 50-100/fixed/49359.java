public static android.graphics.Typeface getMaterialDesignFont(android.content.Context context) {
    if ((material.awesome.android.cyd.com.awesomematerial.FontUtil.materialDesignFont) == null) {
        try {
            material.awesome.android.cyd.com.awesomematerial.FontUtil.materialDesignFont = android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/material-design-iconic-font-1-1.ttf");
        } catch (java.lang.Exception e) {
            android.util.Log.e("AWESOME_MATERIAL", ("Could not get MATERIAL DESIGN ICONIC FONT typeface because " + (e.getMessage())));
            material.awesome.android.cyd.com.awesomematerial.FontUtil.materialDesignFont = android.graphics.Typeface.DEFAULT;
        }
    }
    return material.awesome.android.cyd.com.awesomematerial.FontUtil.materialDesignFont;
}