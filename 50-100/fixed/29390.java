@java.lang.Override
public void run() {
    super.run();
    while (true) {
        sleeping();
        if (company.shouldOrganizeUserMeeting()) {
            company.organizeUserMeeting(this);
            company.userMeeting(this);
            company.deOrganizeUserMeeting();
        }else
            if (company.shouldOrganizeDeveloperMeeting()) {
                company.organizeDeveloperMeeting(this);
                company.developerMeeting(this);
                company.deOrganizeDeveloperMeeting();
            }
        
    } 
}