public easytests.models.PointModelInterface withRelations(easytests.models.PointModelInterface pointModel) {
    if ((this.quizzesOptions) != null) {
        pointModel.setPoint(this.pointsService.find(pointModel.getQuiz().getId(), this.quizzesOptions));
    }
    return pointModel;
}