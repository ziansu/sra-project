private com.upokecenter.mail.Message SetCurrentDate() {
    return this.SetHeader("date", com.upokecenter.mail.Message.GetDateString(com.upokecenter.mail.DateTimeUtilities.GetCurrentLocalTime()));
}