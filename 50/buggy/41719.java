@org.springframework.web.bind.annotation.PostMapping(value = "uploadGenerator")
public void uploadGenerator(@org.springframework.web.bind.annotation.RequestBody
de.busybeever.bachelor.presentation.admin.DownloadGenerator data) {
    adminService.uploadGenerator(data);
}